# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def minOperations(s, t):
    if s >= t:
        return 0
    queue, operations = deque([s]), 0
    while queue:
        size = len(queue)
        for _ in range(size):
            apples = queue.popleft()
            if apples == t:
                return operations
            for eat, throw in [[-1, 1], [1, -1]]:
                new_apples = apples + eat
                if 0 <= new_apples <= t:
                    queue.append(new_apples)
        operations += 1
    return -1
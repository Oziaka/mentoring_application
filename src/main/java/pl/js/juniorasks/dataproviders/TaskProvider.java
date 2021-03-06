package pl.js.juniorasks.dataproviders;

import pl.js.juniorasks.models.Task;

public interface TaskProvider {

    void addTask(Task task);

    Task getTask(String taskId);

    String getMentorNickBasedOnTaskId(String taskId);
}

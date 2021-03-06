package com.example.todo2;

import android.app.Activity;

import com.example.todo2.model.TaskData;
import com.example.todo2.model.TaskDataWithId;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public interface Contract {

    interface addTaskViewToPresenter {
        void onSubmitClick(String name, String type, Calendar date);

        List<String> getTypes();
    }

    interface presenterToAddTaskView {
        void onInvalidInput(String message);

        void onCorrectInput();
    }

    interface addTaskPresenterToModel {
        void saveTask(TaskData taskData);

    }

    interface mainScreenViewToPresenter {

        void onResume();

        void onItemDelete(int position);

        void onAddButtonClick();
    }

    interface presenterToMainScreenView {
        void showTasks(ArrayList<TaskData> taskDatas);

        Activity getActivity();

        void goToAddTaskActivity();
    }

    interface presenterToMainScreenModel {
        ArrayList<TaskDataWithId> queryTasks();

        void deleteTask(int taskId);
    }

}

package com.shared.dtos;

import com.shared.dtos.NotificationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationsResponse {
    private List<NotificationDto> notifications;
}

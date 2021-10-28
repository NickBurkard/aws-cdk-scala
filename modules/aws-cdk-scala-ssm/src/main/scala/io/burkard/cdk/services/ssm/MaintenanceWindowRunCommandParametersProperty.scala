package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MaintenanceWindowRunCommandParametersProperty {

  def apply(
    timeoutSeconds: Option[Number] = None,
    serviceRoleArn: Option[String] = None,
    documentHashType: Option[String] = None,
    comment: Option[String] = None,
    outputS3KeyPrefix: Option[String] = None,
    parameters: Option[AnyRef] = None,
    outputS3BucketName: Option[String] = None,
    notificationConfig: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty] = None,
    documentHash: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.Builder)
      .timeoutSeconds(timeoutSeconds.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .documentHashType(documentHashType.orNull)
      .comment(comment.orNull)
      .outputS3KeyPrefix(outputS3KeyPrefix.orNull)
      .parameters(parameters.orNull)
      .outputS3BucketName(outputS3BucketName.orNull)
      .notificationConfig(notificationConfig.orNull)
      .documentHash(documentHash.orNull)
      .build()
}

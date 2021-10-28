package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfirmPermissionsBroadening {

  def apply(
    id: String,
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    stage: Option[software.amazon.awscdk.Stage] = None
  ): software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening =
    software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder
      .create(id)
      .notificationTopic(notificationTopic.orNull)
      .stage(stage.orNull)
      .build()
}

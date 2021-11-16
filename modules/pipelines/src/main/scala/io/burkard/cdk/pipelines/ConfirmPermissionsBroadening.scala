package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfirmPermissionsBroadening {

  def apply(
    id: String,
    stage: software.amazon.awscdk.Stage,
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening =
    software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder
      .create(id)
      .stage(stage)
      .notificationTopic(notificationTopic.orNull)
      .build()
}

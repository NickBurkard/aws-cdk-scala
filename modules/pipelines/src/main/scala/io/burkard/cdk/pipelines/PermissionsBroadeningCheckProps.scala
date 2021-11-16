package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PermissionsBroadeningCheckProps {

  def apply(
    stage: software.amazon.awscdk.Stage,
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps =
    (new software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.Builder)
      .stage(stage)
      .notificationTopic(notificationTopic.orNull)
      .build()
}

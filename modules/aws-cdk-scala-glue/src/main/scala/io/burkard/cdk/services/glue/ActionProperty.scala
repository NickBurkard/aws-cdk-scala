package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperty {

  def apply(
    jobName: Option[String] = None,
    notificationProperty: Option[software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty] = None,
    securityConfiguration: Option[String] = None,
    timeout: Option[Number] = None,
    crawlerName: Option[String] = None,
    arguments: Option[AnyRef] = None
  ): software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty =
    (new software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty.Builder)
      .jobName(jobName.orNull)
      .notificationProperty(notificationProperty.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .timeout(timeout.orNull)
      .crawlerName(crawlerName.orNull)
      .arguments(arguments.orNull)
      .build()
}

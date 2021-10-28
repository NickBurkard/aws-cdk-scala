package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogRetention {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logGroupRegion: Option[String] = None,
    retention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    logGroupName: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.LogRetention =
    software.amazon.awscdk.services.logs.LogRetention.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .logGroupRegion(logGroupRegion.orNull)
      .retention(retention.orNull)
      .logGroupName(logGroupName.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .build()
}

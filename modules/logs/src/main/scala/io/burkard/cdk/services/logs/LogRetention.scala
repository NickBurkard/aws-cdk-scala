package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogRetention {

  def apply(
    internalResourceId: String,
    retention: software.amazon.awscdk.services.logs.RetentionDays,
    logGroupName: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logGroupRegion: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.LogRetention =
    software.amazon.awscdk.services.logs.LogRetention.Builder
      .create(stackCtx, internalResourceId)
      .retention(retention)
      .logGroupName(logGroupName)
      .role(role.orNull)
      .logGroupRegion(logGroupRegion.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .build()
}

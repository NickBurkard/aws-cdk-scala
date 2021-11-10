package io.burkard.cdk.services.lambda

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogRetention {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logGroupRegion: Option[String] = None,
    retention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    logGroupName: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.LogRetention =
    software.amazon.awscdk.services.lambda.LogRetention.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .logGroupRegion(logGroupRegion.orNull)
      .retention(retention.orNull)
      .logGroupName(logGroupName.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .build()
}

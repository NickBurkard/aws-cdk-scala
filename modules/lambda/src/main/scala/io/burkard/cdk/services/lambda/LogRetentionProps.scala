package io.burkard.cdk.services.lambda

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogRetentionProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logGroupRegion: Option[String] = None,
    retention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    logGroupName: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None
  ): software.amazon.awscdk.services.lambda.LogRetentionProps =
    (new software.amazon.awscdk.services.lambda.LogRetentionProps.Builder)
      .role(role.orNull)
      .logGroupRegion(logGroupRegion.orNull)
      .retention(retention.orNull)
      .logGroupName(logGroupName.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .build()
}

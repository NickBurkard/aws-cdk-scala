package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogRetentionProps {

  def apply(
    retention: software.amazon.awscdk.services.logs.RetentionDays,
    logGroupName: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logGroupRegion: Option[String] = None,
    logRetentionRetryOptions: Option[software.amazon.awscdk.services.logs.LogRetentionRetryOptions] = None
  ): software.amazon.awscdk.services.logs.LogRetentionProps =
    (new software.amazon.awscdk.services.logs.LogRetentionProps.Builder)
      .retention(retention)
      .logGroupName(logGroupName)
      .role(role.orNull)
      .logGroupRegion(logGroupRegion.orNull)
      .logRetentionRetryOptions(logRetentionRetryOptions.orNull)
      .build()
}

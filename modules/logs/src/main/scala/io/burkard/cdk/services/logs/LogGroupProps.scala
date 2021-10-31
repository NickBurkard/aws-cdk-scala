package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogGroupProps {

  def apply(
    retention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    logGroupName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.logs.LogGroupProps =
    (new software.amazon.awscdk.services.logs.LogGroupProps.Builder)
      .retention(retention.orNull)
      .logGroupName(logGroupName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}

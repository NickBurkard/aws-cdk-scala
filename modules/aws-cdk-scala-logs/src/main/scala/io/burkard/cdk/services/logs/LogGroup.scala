package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogGroup {

  def apply(
    internalResourceId: String,
    retention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    logGroupName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.LogGroup =
    software.amazon.awscdk.services.logs.LogGroup.Builder
      .create(stackCtx, internalResourceId)
      .retention(retention.orNull)
      .logGroupName(logGroupName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}

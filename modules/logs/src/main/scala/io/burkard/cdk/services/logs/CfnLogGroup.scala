package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogGroup {

  def apply(
    internalResourceId: String,
    kmsKeyId: Option[String] = None,
    retentionInDays: Option[Number] = None,
    logGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnLogGroup =
    software.amazon.awscdk.services.logs.CfnLogGroup.Builder
      .create(stackCtx, internalResourceId)
      .kmsKeyId(kmsKeyId.orNull)
      .retentionInDays(retentionInDays.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}

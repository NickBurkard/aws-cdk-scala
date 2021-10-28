package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLogGroupProps {

  def apply(
    kmsKeyId: Option[String] = None,
    retentionInDays: Option[Number] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnLogGroupProps =
    (new software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder)
      .kmsKeyId(kmsKeyId.orNull)
      .retentionInDays(retentionInDays.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}

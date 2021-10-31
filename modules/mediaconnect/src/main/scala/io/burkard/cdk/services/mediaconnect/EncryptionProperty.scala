package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionProperty {

  def apply(
    keyType: Option[String] = None,
    algorithm: Option[String] = None,
    roleArn: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.Builder)
      .keyType(keyType.orNull)
      .algorithm(algorithm.orNull)
      .roleArn(roleArn.orNull)
      .secretArn(secretArn.orNull)
      .build()
}

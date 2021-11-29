package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionProperty {

  def apply(
    roleArn: String,
    secretArn: String,
    keyType: Option[String] = None,
    algorithm: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty.Builder)
      .roleArn(roleArn)
      .secretArn(secretArn)
      .keyType(keyType.orNull)
      .algorithm(algorithm.orNull)
      .build()
}

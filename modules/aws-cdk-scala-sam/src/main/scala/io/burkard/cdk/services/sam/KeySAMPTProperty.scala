package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeySAMPTProperty {

  def apply(
    keyId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.Builder)
      .keyId(keyId.orNull)
      .build()
}

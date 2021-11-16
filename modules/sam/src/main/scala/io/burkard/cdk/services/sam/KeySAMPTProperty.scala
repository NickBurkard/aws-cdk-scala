package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeySAMPTProperty {

  def apply(
    keyId: String
  ): software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.Builder)
      .keyId(keyId)
      .build()
}

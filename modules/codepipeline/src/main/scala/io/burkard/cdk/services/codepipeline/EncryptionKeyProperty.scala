package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionKeyProperty {

  def apply(
    id: String,
    `type`: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder)
      .id(id)
      .`type`(`type`)
      .build()
}

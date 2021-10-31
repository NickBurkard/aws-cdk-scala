package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionKeyProperty {

  def apply(
    id: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder)
      .id(id.orNull)
      .`type`(`type`.orNull)
      .build()
}

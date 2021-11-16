package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockerDeclarationProperty {

  def apply(
    name: String,
    `type`: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder)
      .name(name)
      .`type`(`type`)
      .build()
}

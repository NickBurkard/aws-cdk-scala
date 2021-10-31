package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StagePlacement {

  def apply(
    rightBefore: Option[software.amazon.awscdk.services.codepipeline.IStage] = None,
    justAfter: Option[software.amazon.awscdk.services.codepipeline.IStage] = None
  ): software.amazon.awscdk.services.codepipeline.StagePlacement =
    (new software.amazon.awscdk.services.codepipeline.StagePlacement.Builder)
      .rightBefore(rightBefore.orNull)
      .justAfter(justAfter.orNull)
      .build()
}

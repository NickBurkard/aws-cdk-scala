package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeployCdkStackActionOptions {

  def apply(
    prepareRunOrder: Option[Number] = None,
    baseActionName: Option[String] = None,
    outputFileName: Option[String] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    executeRunOrder: Option[Number] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    changeSetName: Option[String] = None
  ): software.amazon.awscdk.pipelines.DeployCdkStackActionOptions =
    (new software.amazon.awscdk.pipelines.DeployCdkStackActionOptions.Builder)
      .prepareRunOrder(prepareRunOrder.orNull)
      .baseActionName(baseActionName.orNull)
      .outputFileName(outputFileName.orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .output(output.orNull)
      .changeSetName(changeSetName.orNull)
      .build()
}

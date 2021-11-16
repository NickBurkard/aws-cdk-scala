package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackDeploymentProps {

  def apply(
    stackArtifactId: String,
    absoluteTemplatePath: String,
    constructPath: String,
    stackName: String,
    assumeRoleArn: Option[String] = None,
    assets: Option[List[_ <: software.amazon.awscdk.pipelines.StackAsset]] = None,
    tags: Option[Map[String, String]] = None,
    templateS3Uri: Option[String] = None,
    executionRoleArn: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.pipelines.StackDeploymentProps =
    (new software.amazon.awscdk.pipelines.StackDeploymentProps.Builder)
      .stackArtifactId(stackArtifactId)
      .absoluteTemplatePath(absoluteTemplatePath)
      .constructPath(constructPath)
      .stackName(stackName)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assets(assets.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .templateS3Uri(templateS3Uri.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}

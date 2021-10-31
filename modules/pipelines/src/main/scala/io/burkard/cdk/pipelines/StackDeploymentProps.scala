package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StackDeploymentProps {

  def apply(
    assumeRoleArn: Option[String] = None,
    assets: Option[List[_ <: software.amazon.awscdk.pipelines.StackAsset]] = None,
    tags: Option[Map[String, String]] = None,
    stackArtifactId: Option[String] = None,
    absoluteTemplatePath: Option[String] = None,
    templateS3Uri: Option[String] = None,
    executionRoleArn: Option[String] = None,
    constructPath: Option[String] = None,
    region: Option[String] = None,
    stackName: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.pipelines.StackDeploymentProps =
    (new software.amazon.awscdk.pipelines.StackDeploymentProps.Builder)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assets(assets.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .stackArtifactId(stackArtifactId.orNull)
      .absoluteTemplatePath(absoluteTemplatePath.orNull)
      .templateS3Uri(templateS3Uri.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .constructPath(constructPath.orNull)
      .region(region.orNull)
      .stackName(stackName.orNull)
      .account(account.orNull)
      .build()
}

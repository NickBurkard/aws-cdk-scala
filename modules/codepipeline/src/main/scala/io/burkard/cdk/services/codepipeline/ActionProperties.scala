package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperties {

  def apply(
    artifactBounds: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
    provider: String,
    actionName: String,
    category: software.amazon.awscdk.services.codepipeline.ActionCategory,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    version: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    resource: Option[software.amazon.awscdk.IResource] = None,
    runOrder: Option[Number] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    owner: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.ActionProperties =
    (new software.amazon.awscdk.services.codepipeline.ActionProperties.Builder)
      .artifactBounds(artifactBounds)
      .provider(provider)
      .actionName(actionName)
      .category(category)
      .role(role.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .version(version.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .resource(resource.orNull)
      .runOrder(runOrder.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .owner(owner.orNull)
      .build()
}

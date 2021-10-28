package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperties {

  def apply(
    artifactBounds: Option[software.amazon.awscdk.services.codepipeline.ActionArtifactBounds] = None,
    provider: Option[String] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    version: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    resource: Option[software.amazon.awscdk.IResource] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    region: Option[String] = None,
    category: Option[software.amazon.awscdk.services.codepipeline.ActionCategory] = None,
    account: Option[String] = None,
    owner: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.ActionProperties =
    (new software.amazon.awscdk.services.codepipeline.ActionProperties.Builder)
      .artifactBounds(artifactBounds.orNull)
      .provider(provider.orNull)
      .role(role.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .version(version.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .resource(resource.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .region(region.orNull)
      .category(category.orNull)
      .account(account.orNull)
      .owner(owner.orNull)
      .build()
}

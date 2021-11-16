package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsDeployAction {

  def apply(
    service: software.amazon.awscdk.services.ecs.IBaseService,
    deploymentTimeout: Option[software.amazon.awscdk.Duration] = None,
    imageFile: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    variablesNamespace: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction.Builder
      .create()
      .service(service)
      .deploymentTimeout(deploymentTimeout.orNull)
      .imageFile(imageFile.orNull)
      .role(role.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .input(input.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .build()
}

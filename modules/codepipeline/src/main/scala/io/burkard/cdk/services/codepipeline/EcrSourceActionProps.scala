package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcrSourceActionProps {

  def apply(
    repository: software.amazon.awscdk.services.ecr.IRepository,
    output: software.amazon.awscdk.services.codepipeline.Artifact,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    imageTag: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.EcrSourceActionProps.Builder)
      .repository(repository)
      .output(output)
      .role(role.orNull)
      .imageTag(imageTag.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}

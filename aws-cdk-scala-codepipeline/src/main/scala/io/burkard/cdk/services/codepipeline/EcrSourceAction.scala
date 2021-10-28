package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcrSourceAction {

  def apply(
    repository: Option[software.amazon.awscdk.services.ecr.IRepository] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    imageTag: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction =
    software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction.Builder
      .create()
      .repository(repository.orNull)
      .role(role.orNull)
      .imageTag(imageTag.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .output(output.orNull)
      .build()
}

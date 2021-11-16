package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlexaSkillDeployAction {

  def apply(
    clientId: String,
    skillId: String,
    input: software.amazon.awscdk.services.codepipeline.Artifact,
    refreshToken: software.amazon.awscdk.SecretValue,
    clientSecret: software.amazon.awscdk.SecretValue,
    parameterOverridesArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder
      .create()
      .clientId(clientId)
      .skillId(skillId)
      .input(input)
      .refreshToken(refreshToken)
      .clientSecret(clientSecret)
      .parameterOverridesArtifact(parameterOverridesArtifact.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}

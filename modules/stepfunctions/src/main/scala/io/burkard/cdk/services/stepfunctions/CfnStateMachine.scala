package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStateMachine {

  def apply(
    internalResourceId: String,
    definitionString: Option[String] = None,
    definitionSubstitutions: Option[Map[String, String]] = None,
    loggingConfiguration: Option[software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty] = None,
    definitionS3Location: Option[software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty]] = None,
    stateMachineType: Option[String] = None,
    tracingConfiguration: Option[software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty] = None,
    roleArn: Option[String] = None,
    definition: Option[software.amazon.awscdk.services.stepfunctions.CfnStateMachine.DefinitionProperty] = None,
    stateMachineName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.CfnStateMachine =
    software.amazon.awscdk.services.stepfunctions.CfnStateMachine.Builder
      .create(stackCtx, internalResourceId)
      .definitionString(definitionString.orNull)
      .definitionSubstitutions(definitionSubstitutions.map(_.asJava).orNull)
      .loggingConfiguration(loggingConfiguration.orNull)
      .definitionS3Location(definitionS3Location.orNull)
      .tags(tags.map(_.asJava).orNull)
      .stateMachineType(stateMachineType.orNull)
      .tracingConfiguration(tracingConfiguration.orNull)
      .roleArn(roleArn.orNull)
      .definition(definition.orNull)
      .stateMachineName(stateMachineName.orNull)
      .build()
}

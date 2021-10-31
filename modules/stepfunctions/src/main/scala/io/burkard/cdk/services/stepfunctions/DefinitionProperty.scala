package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionProperty {

  def apply: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.DefinitionProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnStateMachine.DefinitionProperty.Builder)
      
      .build()
}

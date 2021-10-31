package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BootstrapActionConfigProperty {

  def apply(
    name: Option[String] = None,
    scriptBootstrapAction: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.Builder)
      .name(name.orNull)
      .scriptBootstrapAction(scriptBootstrapAction.orNull)
      .build()
}

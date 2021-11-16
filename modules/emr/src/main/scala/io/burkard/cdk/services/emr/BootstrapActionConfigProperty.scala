package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BootstrapActionConfigProperty {

  def apply(
    name: String,
    scriptBootstrapAction: software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty
  ): software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder)
      .name(name)
      .scriptBootstrapAction(scriptBootstrapAction)
      .build()
}

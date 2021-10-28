package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BootstrapActionConfigProperty {

  def apply(
    name: Option[String] = None,
    scriptBootstrapAction: Option[software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder)
      .name(name.orNull)
      .scriptBootstrapAction(scriptBootstrapAction.orNull)
      .build()
}

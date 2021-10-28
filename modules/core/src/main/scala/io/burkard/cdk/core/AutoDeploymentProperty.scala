package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoDeploymentProperty {

  def apply(
    enabled: Option[Boolean] = None,
    retainStacksOnAccountRemoval: Option[Boolean] = None
  ): software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty =
    (new software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .retainStacksOnAccountRemoval(retainStacksOnAccountRemoval.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
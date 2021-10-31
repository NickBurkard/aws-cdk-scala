package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnPremisesTagSetListObjectProperty {

  def apply(
    onPremisesTagGroup: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder)
      .onPremisesTagGroup(onPremisesTagGroup.map(_.asJava).orNull)
      .build()
}

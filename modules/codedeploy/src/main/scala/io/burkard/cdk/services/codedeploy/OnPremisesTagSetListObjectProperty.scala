package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnPremisesTagSetListObjectProperty {

  def apply(
    onPremisesTagGroup: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder)
      .onPremisesTagGroup(onPremisesTagGroup.map(_.asJava).orNull)
      .build()
}

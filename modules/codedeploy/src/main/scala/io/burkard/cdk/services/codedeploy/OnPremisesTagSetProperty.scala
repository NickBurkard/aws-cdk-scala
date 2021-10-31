package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnPremisesTagSetProperty {

  def apply(
    onPremisesTagSetList: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty.Builder)
      .onPremisesTagSetList(onPremisesTagSetList.map(_.asJava).orNull)
      .build()
}

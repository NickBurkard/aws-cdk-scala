package io.burkard.cdk.services.devopsguru

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudFormationCollectionFilterProperty {

  def apply(
    stackNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty =
    (new software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder)
      .stackNames(stackNames.map(_.asJava).orNull)
      .build()
}

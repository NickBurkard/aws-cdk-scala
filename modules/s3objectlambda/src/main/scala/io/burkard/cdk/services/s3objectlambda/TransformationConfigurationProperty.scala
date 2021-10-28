package io.burkard.cdk.services.s3objectlambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformationConfigurationProperty {

  def apply(
    actions: Option[List[String]] = None,
    contentTransformation: Option[AnyRef] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty.Builder)
      .actions(actions.map(_.asJava).orNull)
      .contentTransformation(contentTransformation.orNull)
      .build()
}

package io.burkard.cdk.services.s3objectlambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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

package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsCloudFormationStackProperties {

  def apply(
    templateFile: String,
    terminationProtection: Option[Boolean] = None,
    stackName: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties =
    (new software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.Builder)
      .templateFile(templateFile)
      .terminationProtection(terminationProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackName(stackName.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}

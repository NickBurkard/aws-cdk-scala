package io.burkard.cdk.services.finspace

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnvironmentProps {

  def apply(
    name: String,
    superuserParameters: Option[software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty] = None,
    description: Option[String] = None,
    dataBundles: Option[List[String]] = None,
    federationMode: Option[String] = None,
    federationParameters: Option[software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.finspace.CfnEnvironmentProps =
    (new software.amazon.awscdk.services.finspace.CfnEnvironmentProps.Builder)
      .name(name)
      .superuserParameters(superuserParameters.orNull)
      .description(description.orNull)
      .dataBundles(dataBundles.map(_.asJava).orNull)
      .federationMode(federationMode.orNull)
      .federationParameters(federationParameters.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}

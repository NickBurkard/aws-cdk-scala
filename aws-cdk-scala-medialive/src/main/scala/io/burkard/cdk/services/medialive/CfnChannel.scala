package io.burkard.cdk.services.medialive

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnChannel {

  def apply(
    internalResourceId: String,
    inputAttachments: Option[List[_]] = None,
    name: Option[String] = None,
    encoderSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty] = None,
    channelClass: Option[String] = None,
    roleArn: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty] = None,
    tags: Option[AnyRef] = None,
    cdiInputSpecification: Option[software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty] = None,
    destinations: Option[List[_]] = None,
    inputSpecification: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty] = None,
    logLevel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.medialive.CfnChannel =
    software.amazon.awscdk.services.medialive.CfnChannel.Builder
      .create(stackCtx, internalResourceId)
      .inputAttachments(inputAttachments.map(_.asJava).orNull)
      .name(name.orNull)
      .encoderSettings(encoderSettings.orNull)
      .channelClass(channelClass.orNull)
      .roleArn(roleArn.orNull)
      .vpc(vpc.orNull)
      .tags(tags.orNull)
      .cdiInputSpecification(cdiInputSpecification.orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .inputSpecification(inputSpecification.orNull)
      .logLevel(logLevel.orNull)
      .build()
}

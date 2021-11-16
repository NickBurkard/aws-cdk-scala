package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobTemplate {

  def apply(
    internalResourceId: String,
    jobTemplateId: String,
    description: String,
    jobExecutionsRolloutConfig: Option[AnyRef] = None,
    presignedUrlConfig: Option[AnyRef] = None,
    abortConfig: Option[AnyRef] = None,
    timeoutConfig: Option[AnyRef] = None,
    documentSource: Option[String] = None,
    document: Option[String] = None,
    jobArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnJobTemplate =
    software.amazon.awscdk.services.iot.CfnJobTemplate.Builder
      .create(stackCtx, internalResourceId)
      .jobTemplateId(jobTemplateId)
      .description(description)
      .jobExecutionsRolloutConfig(jobExecutionsRolloutConfig.orNull)
      .presignedUrlConfig(presignedUrlConfig.orNull)
      .abortConfig(abortConfig.orNull)
      .timeoutConfig(timeoutConfig.orNull)
      .documentSource(documentSource.orNull)
      .document(document.orNull)
      .jobArn(jobArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

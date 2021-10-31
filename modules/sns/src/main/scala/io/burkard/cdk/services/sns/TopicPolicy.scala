package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicPolicy {

  def apply(
    internalResourceId: String,
    topics: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    policyDocument: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.TopicPolicy =
    software.amazon.awscdk.services.sns.TopicPolicy.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}

package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServerCertificate {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    certificateBody: Option[String] = None,
    privateKey: Option[String] = None,
    certificateChain: Option[String] = None,
    serverCertificateName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnServerCertificate =
    software.amazon.awscdk.services.iam.CfnServerCertificate.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .certificateBody(certificateBody.orNull)
      .privateKey(privateKey.orNull)
      .certificateChain(certificateChain.orNull)
      .serverCertificateName(serverCertificateName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

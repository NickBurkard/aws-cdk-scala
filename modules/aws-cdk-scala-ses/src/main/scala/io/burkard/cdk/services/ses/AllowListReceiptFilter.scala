package io.burkard.cdk.services.ses

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AllowListReceiptFilter {

  def apply(
    internalResourceId: String,
    ips: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.AllowListReceiptFilter =
    software.amazon.awscdk.services.ses.AllowListReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .ips(ips.map(_.asJava).orNull)
      .build()
}

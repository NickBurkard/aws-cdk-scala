package io.burkard.cdk.services.cloudfront

sealed abstract class FunctionEventType(val underlying: software.amazon.awscdk.services.cloudfront.FunctionEventType)
  extends Product
    with Serializable

object FunctionEventType {
  implicit def toAws(value: FunctionEventType): software.amazon.awscdk.services.cloudfront.FunctionEventType =
    Option(value).map(_.underlying).orNull

  case object ViewerRequest
    extends FunctionEventType(software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_REQUEST)

  case object ViewerResponse
    extends FunctionEventType(software.amazon.awscdk.services.cloudfront.FunctionEventType.VIEWER_RESPONSE)
}
